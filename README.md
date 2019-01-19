# Movies-App

Project Overview
----------------
This project aims to implement The Clean Architecture with MVVM in the presentation layer 
and demonstrates the usage of Android Architecture Components.

The structure of the packages achieves The separation of concerns.

Each business feature has its own package which contains data, domain and presentation package for each.

Live Data is used due its awareness of the activity life cycle.

Presentation layer
------------------
   contains Activities, Adapters and ViewModels and only renders and handles views, 
   the objective is to make the presentation layer as dummy as possible.

Domain layer
-------------
   includes Use Cases that will have all business logic and interaction between Data and Presentation layer 
   by means of interfaces and interactors, the objective is to make the domain layer independent of anything.

Data layer
-----------
   includes the repositories and data classes.


Used Libraries
--------------

 * Dagger2
 * RxJava2
 * Retrofit2
 * Android Architecture Components
 * Picasso







