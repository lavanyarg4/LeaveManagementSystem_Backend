package com.stg.leavemanagementsystem.serviceinterface;

import com.stg.leavemanagementsystem.entity.LeaveBalance;

public interface LeaveBalanceService {
    LeaveBalance getLeaveBalanceByEmployeeId(Integer employeeId);
    void updateLeaveBalance(LeaveBalance leaveBalance);
}
