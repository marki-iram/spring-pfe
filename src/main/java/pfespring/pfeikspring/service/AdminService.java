package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.AdminRepository;
import pfespring.pfeikspring.entity.Admin;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public void createAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    public void updateAdmin(int id, Admin admin) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setNom(admin.getNom());
            existingAdmin.setPrenom(admin.getPrenom());
            existingAdmin.setEmail(admin.getEmail());
            existingAdmin.setTelephone(admin.getTelephone());
            existingAdmin.setDatedeNaissance(admin.getDatedeNaissance());
            existingAdmin.setSexe(admin.getSexe());
            existingAdmin.setAdresse(admin.getAdresse());
            existingAdmin.setVille(admin.getVille());
            existingAdmin.setMotDepasse(admin.getMotDepasse());
            existingAdmin.setRole(admin.getRole());
            existingAdmin.setPhoto(admin.getPhoto());
            adminRepository.save(existingAdmin);
        }
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }

}
