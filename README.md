# TAE-project

1. Download kafka: https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.0/kafka_2.13-3.2.0.tgz

2. Unzip kafka 2 times & put replace server.properties with the one provided by me

3. Start zookeeper server: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
4. Start kafka server: .\bin\windows\kafka-server-start.bat .\config\server.properties
5. Open kafka topic to follow messages flow: .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic conference-invitations --from-beginning 
