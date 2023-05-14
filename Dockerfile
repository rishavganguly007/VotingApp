FROM centos
RUN dnf --disablerepo '*' --enablerepo=extras swap centos-linux-repos centos-stream-repos --assumeyes
RUN dnf distro-sync --assumeyes
RUN yum install java-17-openjdk --assumeyes
RUN which java
RUN mkdir /opt/voting
WORKDIR /opt/voting
COPY apache-maven-3.9.2-bin.tar.gz /opt/voting
COPY VotingApp.tar.gz /opt/voting
RUN tar -xvzf apache-maven-3.9.2-bin.tar.gz
RUN tar -xvzf VotingApp.tar.gz
RUN ls -lah
ENV M2_HOME /opt/voting/apache-maven-3.9.2
ENV M2 /opt/voting/apache-maven-3.9.2/bin
ENV PATH $M2:$PATH
RUN mvn --version
RUN ls -lah
RUN mvn -f VotingApp/pom.xml clean install
WORKDIR VotingApp/target
RUN ls -lah
ENTRYPOINT ["java", "-jar", "VotingApp-0.0.1-SNAPSHOT.jar"]
