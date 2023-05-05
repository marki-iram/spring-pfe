

package pfespring.pfeikspring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
import pfespring.pfeikspring.entity.Classename;
import pfespring.pfeikspring.entity.Reservation;
import pfespring.pfeikspring.entity.Terrain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User extends Classename {
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Terrain> terrains = new ArrayList<>();


        public void gererReservations() {
            Scanner scanner = new Scanner(System.in);
            int choix;

            do {
                System.out.println("1 - Afficher les réservations");
                System.out.println("2 - Ajouter une reservation");
                System.out.println("3 - Annuler une reservation");
                System.out.println("4 - Quitter");
                choix = scanner.nextInt();
                scanner.nextLine(); // pour vider le tampon
                switch (choix) {
                    case 1:
                        afficherReservations();
                        break;
                    case 2:
                        ajouterReservation();
                        break;
                    case 3:
                        supprimerReservation();
                        break;
                    case 4:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            } while (choix != 4);
        }
    private void afficherReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Aucune réservation trouvée.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation.toString());
            }
        }
    }
    private void ajouterReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ajouter une réservation :");
        System.out.println("Date de début (dd/mm/yyyy) :");
        String dateDebutStr = scanner.nextLine();
        System.out.println("Date de fin (dd/mm/yyyy) :");
        String dateFinStr = scanner.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateDebutResrv = dateFormat.parse(dateDebutStr);
            Date dateFinResev = dateFormat.parse(dateFinStr);


            Reservation reservation = new Reservation(dateDebutResrv,dateFinResev);
            reservations.add(reservation);

            System.out.println("Réservation ajoutée avec succès.");
        } catch (java.text.ParseException e) {
            throw new RuntimeException(e);
        }

    }
    private void supprimerReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Supprimer une réservation :");
        System.out.println("Entrez l'index de la réservation à supprimer :");
        int index = scanner.nextInt();

        if (index >= 0 && index < reservations.size()) {
            reservations.remove(index);
            System.out.println("Réservation supprimée avec succès.");
        } else {
            System.out.println("Index invalide !");
        }
    }



        public void gererTerrains() {
            Scanner scanner = new Scanner(System.in);
            int choix;

            do {
                System.out.println("1 - Afficher les terrains");
                System.out.println("2 - Ajouter un terrain");
                System.out.println("3 - Supprimer un terrain");
                System.out.println("4 - Quitter");
                choix = scanner.nextInt();
                scanner.nextLine(); // pour vider le tampon
                switch (choix) {
                    case 1:
                        afficherTerrains();
                        break;
                    case 2:
                        ajouterTerrain();
                        break;
                    case 3:
                        supprimerTerrain();
                        break;
                    case 4:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            } while (choix != 4);
            }
     private void afficherTerrains() {

        System.out.println("Liste des terrains :");
        for (Terrain terrain : terrains) {
            System.out.println(terrain.toString());
        }
    }
    private void ajouterTerrain() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ajouter un terrain :");

        System.out.println("Id :");
        int id = scanner.nextInt();

        System.out.println("NomTerrain :");
        String nomTerrain = scanner.nextLine();

        System.out.println("Sport :");
        String sport = scanner.nextLine();

        System.out.println("Disponiblite :");
        String disponibilite = scanner.nextLine();

        System.out.println("Prix :");
        String prix = scanner.nextLine();

        System.out.println("Stade_id :");
        int stade_id = scanner.nextInt();

        System.out.println("Surface :");
        double surface = scanner.nextDouble();

        scanner.nextLine(); // pour vider le tampon
        System.out.println("Description :");
        String description = scanner.nextLine();

        Terrain terrain = new Terrain(id , nomTerrain , sport , disponibilite, prix, stade_id, surface,description);
        terrains.add(terrain);

        System.out.println("Terrain ajouté avec succès.");
    }
    private void supprimerTerrain() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Supprimer un terrain :");
        System.out.println("Entrez l'index du terrain à supprimer :");
        int index = scanner.nextInt();

        if (index >= 0 && index < terrains.size()) {
            terrains.remove(index);
            System.out.println("Terrain supprimé avec succès.");
        } else {
            System.out.println("Index invalide !");
        }
        }

    }



