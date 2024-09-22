package com.stg.leavemanagementsystem.serviceimplementation;

import com.stg.leavemanagementsystem.entity.LeaveBalance;
import com.stg.leavemanagementsystem.entity.LeaveRequest;
import com.stg.leavemanagementsystem.enums.LeaveStatus;
import com.stg.leavemanagementsystem.repository.LeaveRequestRepository;
import com.stg.leavemanagementsystem.serviceinterface.LeaveBalanceService;
import com.stg.leavemanagementsystem.serviceinterface.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    @Autowired
    private LeaveBalanceService leaveBalanceService;

    @Override
    public LeaveRequest applyLeave(LeaveRequest leaveRequest) {
        leaveRequest.setStatus(LeaveStatus.SUBMITTED);
        return leaveRequestRepository.save(leaveRequest);
    }

    @Override
    public LeaveRequest updateLeaveRequestStatus(Integer id, LeaveStatus status) {
        LeaveRequest leaveRequest = leaveRequestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave request not found"));
        leaveRequest.setStatus(status);
        if (status == LeaveStatus.APPROVED) {
            LeaveBalance leaveBalance = leaveBalanceService.getLeaveBalanceByEmployeeId(leaveRequest.getEmployee().getId());
            updateLeaveBalanceBasedOnType(leaveBalance, leaveRequest);
        }
        return leaveRequestRepository.save(leaveRequest);
    }

    private void updateLeaveBalanceBasedOnType(LeaveBalance leaveBalance, LeaveRequest leaveRequest) {
        // Logic to update leave balance based on leave type
    }

    @Override
    public List<LeaveRequest> getLeaveRequestsByEmployeeId(Integer employeeId) {
        return leaveRequestRepository.findByEmployeeId(employeeId);
    }

    @Override
    public void withdrawLeave(Integer id) {
        LeaveRequest leaveRequest = leaveRequestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave request not found"));
        if (leaveRequest.getStatus() == LeaveStatus.SUBMITTED || leaveRequest.getStatus() == LeaveStatus.APPROVED) {
            leaveRequest.setStatus(LeaveStatus.WITHDRAWN);
            leaveRequestRepository.save(leaveRequest);
        } else {
            throw new RuntimeException("Cannot withdraw leave with status: " + leaveRequest.getStatus());
        }
    }
}
