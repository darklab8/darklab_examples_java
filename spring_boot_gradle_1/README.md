# installing java
https://adoptium.net/en-GB/blog/2021/12/eclipse-temurin-linux-installers-available/

- sudo apt update
- sudo apt-get install -y wget apt-transport-https gnupg
- sudo wget -O - https://packages.adoptium.net/artifactory/api/gpg/key/public | sudo apt-key add -
- sudo echo "deb https://packages.adoptium.net/artifactory/deb $(awk -F= '/^VERSION_CODENAME/{print$2}' /etc/os-release) main" | sudo tee /etc/apt/sources.list.d/adoptium.list
- apt-get update # update if you haven't already
- apt-get install temurin-17-jdk

# installing gradle
https://gradle.org/install/

- sudo mkdir /opt/gradle
- wget -c https://services.gradle.org/distributions/gradle-8.0.2-bin.zip -P /tmp
- sudo unzip -d /opt/gradle /tmp/gradle-8.0.2-bin.zip
...
- source /etc/profile.d/gradle.sh

# initalized project as
- gradle init

# compiler
?