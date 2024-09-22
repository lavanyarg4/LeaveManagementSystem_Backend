package com.stg.leavemanagementsystem.serviceimplementation;

import com.stg.leavemanagementsystem.entity.LeaveBalance;
import com.stg.leavemanagementsystem.repository.LeaveBalanceRepository;
import com.stg.leavemanagementsystem.serviceinterface.LeaveBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveBalanceServiceImpl implements LeaveBalanceService {

    @Autowired
    private LeaveBalanceRepository leaveBalanceRepository;

    @Override
    public LeaveBalance getLeaveBalanceByEmployeeId(Integer employeeId) {
        return leaveBalanceRepository.findByEmployeeId(employeeId);
    }

    @Override
    public void updateLeaveBalance(LeaveBalance leaveBalance) {
        leaveBalanceRepository.save(leaveBalance);
    }
}

