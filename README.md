<br/>
<p align="center">
  <a href="https://github.com/just-dev-creator/LifeStealCopy">
    <img src="https://gamepedia.cursecdn.com/minecraft_gamepedia/9/9b/Heart_of_the_Sea_JE1_BE2.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">LifeSteal SMP Clone</h3>

  <p align="center">
    A quickly written plugin for my brother
    <br/>
    <br/>
    <a href="https://github.com/just-dev-creator/LifeStealCopy/issues">Report Bug</a>
    .
    <a href="https://github.com/just-dev-creator/LifeStealCopy/issues">Request Feature</a>
  </p>

[comment]: <> (![Downloads]&#40;https://img.shields.io/github/downloads/just-dev-creator/LifeStealCopy/total?style=for-the-badge&#41;)
![Issues](https://img.shields.io/github/issues/just-dev-creator/LifeStealCopy?style=for-the-badge&logo=GitHub)
![License](https://img.shields.io/github/license/just-dev-creator/LifeStealCopy?style=for-the-badge&logo=apache)

## Table Of Contents

* [About the Project](#about-the-project)
* [Built With](#built-with)
* [Getting Started](#getting-started)
    * [Prerequisites](#prerequisites)
    * [Installation](#installation)
* [Usage](#usage)
    * [Removing the admin-abuse protections](#removing-the-admin-abuse-protections)
* [Contributing](#contributing)
* [License](#license)
* [Authors](#authors)
* [Acknowledgements](#acknowledgements)

## About The Project

My brother wanted me to create a plugin that has the functionality of the LifeSteal SMP project.
It was made using pretty simple functions, so it can be used for a long time without me needing to update it.

## Built With



* [Kotlin](https://kotlinlang.org/)
* [Gradle](https://gradle.org/)
* [Spigot](https://spigotmc.org/)

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.

* gradle

```sh
apt-get install gradle
```
* java
```sh
apt-get install openjdk-16
```

### Installation

1. Clone the repo

```sh
git clone https://github.com/just-dev-creator/LifeStealCopy.git && cd LifeStealCopy
```

## Usage

Build the project using the following command:
```sh
./gradlew shadowJar
```

### Removing the admin-abuse protections
To remove the admin abuse protection, comment out these two lines in the `Main.kt` file:
```kotlin
//        To remove all protection against admin abuse, remove the following lines of code.
        pluginManager.registerEvents(GamemodeListener(), this);
        pluginManager.registerEvents(JoinListener(), this);
        pluginManager.registerEvents(ServerCommandEvent(), this);
//        End of protection
```

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.
* If you have suggestions, feel free to [open an issue](https://github.com/just-dev-creator/LifeStealCopy/issues/new) to discuss it, or directly create a pull request.
* Please make sure you check your spelling and grammar.
* Create individual PR for each suggestion.

### Creating A Pull Request

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the [Apache 2.0](http://www.apache.org/licenses/) License. See LICENSE.md for more information.

## Authors

* **justCoding** - *Student in Germany* - [just-dev-creator](https://github.com/just-dev-creator/)

## Acknowledgements

* [LifeSteal SMP](https://www.youtube.com/watch?v=86HAi1jTGOg)
* [ShaanCoding](https://github.com/ShaanCoding/)
* [ImgShields](https://shields.io/)
