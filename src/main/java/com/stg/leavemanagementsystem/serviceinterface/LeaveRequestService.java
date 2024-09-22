package com.stg.leavemanagementsystem.serviceinterface;

import com.stg.leavemanagementsystem.entity.LeaveRequest;
import com.stg.leavemanagementsystem.enums.LeaveStatus;

import java.util.List;

public interface LeaveRequestService {
    LeaveRequest applyLeave(LeaveRequest leaveRequest);
    LeaveRequest updateLeaveRequestStatus(Integer id, LeaveStatus status);
    List<LeaveRequest> getLeaveRequestsByEmployeeId(Integer employeeId);
    void withdrawLeave(Integer id);
}
