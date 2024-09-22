package com.stg.leavemanagementsystem.controller;

import com.stg.leavemanagementsystem.entity.LeaveRequest;
import com.stg.leavemanagementsystem.enums.LeaveStatus;
import com.stg.leavemanagementsystem.serviceinterface.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave-requests")
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;

    @PostMapping
    public LeaveRequest applyLeave(@RequestBody LeaveRequest leaveRequest) {
        return leaveRequestService.applyLeave(leaveRequest);
    }

    @PutMapping("/{id}/status")
    public LeaveRequest updateLeaveStatus(@PathVariable Integer id, @RequestParam LeaveStatus status) {
        return leaveRequestService.updateLeaveRequestStatus(id, status);
    }

    @GetMapping("/employee/{employeeId}")
    public List<LeaveRequest> getLeaveRequestsByEmployeeId(@PathVariable Integer employeeId) {
        return leaveRequestService.getLeaveRequestsByEmployeeId(employeeId);
    }

    @PutMapping("/{id}/withdraw")
    public void withdrawLeave(@PathVariable Integer id) {
        leaveRequestService.withdrawLeave(id);
    }
}
