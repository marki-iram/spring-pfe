package pfespring.pfeikspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfespring.pfeikspring.service.AdminService;
import pfespring.pfeikspring.entity.Admin;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/")
    public void createAdmin(@RequestBody Admin admin) {
        adminService.createAdmin(admin);
    }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    @PutMapping("/{id}")
    public void updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
        adminService.updateAdmin(id, admin);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);
    }

}
