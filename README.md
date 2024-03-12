
## Mise en route
1. Clonez le projet sur votre machine locale.
2. Assurez-vous que vous avez Java et Maven installés.
3. Compilez et exécutez le projet avec Maven: `mvn spring-boot:run`.

## API Endpoints
### Récupérer les Modes de Livraison
- **Endpoint:** `/api/delivery/modes`
- **Méthode HTTP:** GET
- **Description:** Récupère les modes de livraison disponibles.

### Récupérer les Créneaux Horaires
- **Endpoint:** `/api/delivery/slots`
- **Méthode HTTP:** GET
- **Paramètres:** `mode` (Mode de livraison)
- **Description:** Récupère les créneaux horaires disponibles en fonction du mode de livraison.

## Fonctionnalités Bonus
- ...

## Contribuer
1. Fork le projet.
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/nom-de-la-fonctionnalite`).
3. Committez vos modifications (`git commit -m 'Ajouter une nouvelle fonctionnalité'`).
4. Poussez vers la branche (`git push origin feature/nom-de-la-fonctionnalite`).
5. Ouvrez une Pull Request.

## Auteurs
- Ali Ben Amor

## License
Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.
