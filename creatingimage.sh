#!/bin/bash
mkdir VotingApp
wget https://dlcdn.apache.org/maven/maven-3/3.9.2/binaries/apache-maven-3.9.2-bin.tar.gz
cp mvnw mvnw.cmd pom.xml VotingApp
cp -R src VotingApp
tar -czvf VotingApp.tar.gz VotingApp
docker stop my-voting-app
docker rm my-voting-app
docker rmi VotingApp
docker build . -t votingapp
docker run -d --name my-voting-app -p 8082:8080 votingapp
rm -rf mvnw mvnw.cmd pom.xml src
rm -rf VotingApp VotingApp.tar.gz
