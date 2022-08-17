# Projet 2 - *TwitterMK*

**Nom de votre application** est une application Android qui permet à un utilisateur d'afficher sa chronologie Twitter et de publier un nouveau tweet. L'application utilise [Twitter REST API](https://dev.twitter.com/rest/public).

Temps passé : **X** heures passées au total

## Histoires d'utilisateurs

La fonctionnalité **obligatoire** suivante est terminée :

- [X] L'utilisateur peut **composer et publier un nouveau tweet**
  - [X] L'utilisateur peut cliquer sur une icône "Composer" dans la barre d'action en haut à droite
  - [X] L'utilisateur peut alors saisir un nouveau tweet et le publier sur Twitter
  - [X] L'utilisateur est ramené à la chronologie d'accueil avec **nouveau tweet visible** dans la chronologie
  - [X] Le tweet nouvellement créé doit être inséré manuellement dans la chronologie et ne pas dépendre d'une actualisation complète
  - [X] L'utilisateur peut ** voir un compteur avec le nombre total de caractères restants pour le tweet ** sur la page de composition du tweet

Les fonctionnalités **facultatives** suivantes sont implémentées :

- [ ] L'utilisateur utilise **les couleurs et les styles "de marque Twitter"**
- [ ] L'utilisateur peut cliquer sur les liens dans les tweets lancer le navigateur Web
- [ ] L'utilisateur peut **sélectionner "répondre" dans la vue détaillée pour répondre à un tweet**
- [ ] L'action "Compose" est déplacée vers un FloatingActionButton au lieu de sur l'AppBar
- [ ] La fonctionnalité Composer un tweet est construite à l'aide d'une superposition modale
- [ ] Utilisez Parcelable au lieu de Serializable à l'aide de la populaire [bibliothèque Parceler] (http://guides.codepath.org/android/Using-Parceler).
- [ ] L'utilisateur peut ** ouvrir l'application Twitter hors ligne et voir les derniers tweets chargés **. Les tweets persistants dans SQLite sont actualisés à chaque lancement d'application. Alors que les "données en direct" sont affichées lorsque l'application peut les obtenir à partir de l'API Twitter, elles sont également enregistrées pour une utilisation en mode hors ligne.
- [ ] Lorsqu'un utilisateur quitte la vue de composition sans publier et qu'il existe du texte, invite à enregistrer ou à supprimer le brouillon. S'il est enregistré, le brouillon doit alors être **persistant sur le disque** et peut ensuite être repris à partir de la vue de composition.
- [ ] Activez votre application pour recevoir des intentions implicites d'autres applications. Lorsqu'un lien est partagé à partir d'un navigateur Web, il doit pré-remplir le texte et le titre de la page Web lors de la rédaction d'un tweet.

Les fonctionnalités **supplémentaires** suivantes sont implémentées :

- [ ] Énumérez tout ce que vous pouvez faire pour améliorer la fonctionnalité de l'application !

## Procédure vidéo

Voici une présentation des user stories implémentées :

<img src='https://github.com/Biggy123123/TwitterMK2/blob/main/Twitter2gif%5B1%5D.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF créé avec [LiceCap](http://www.cockos.com/licecap/).

## Remarques

Décrivez les difficultés rencontrées lors de la création de l'application.

## Bibliothèques open-source utilisées

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Glide](https://github.com/bumptech/glide) - Bibliothèque de chargement et de mise en cache d'images pour Android

## Licence

    Copyright [aaaa] [nom du titulaire des droits d'auteur]

    Sous licence Apache License, Version 2.0 (la "Licence");
    vous ne pouvez pas utiliser ce fichier sauf en conformité avec la licence.
    Vous pouvez obtenir une copie de la licence à

        http://www.apache.org/licenses/LICENSE-2.0

    Sauf si requis par la loi applicable ou convenu par écrit, le logiciel
    distribué sous la Licence est distribué sur une BASE "TEL QUEL",
    SANS GARANTIE OU CONDITION D'AUCUNE SORTE, expresse ou implicite.
    Consultez la licence pour connaître les autorisations spécifiques à la langue et
    limitations en vertu de la licence.
