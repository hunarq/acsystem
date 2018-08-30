# acsystem


How to run it:

-The application can be run in Docker using command:
./start.sh


- To run the REST application without Docker:
./mvnw package && java -jar  -Dserver.port=5000  target/acsystem-0.0.1-SNAPSHOT.jar


-To run Angular app, access UI to Enqueue, Dequeue and List Aircrafts:

cd ui
npm install
ng server

Browse to http://localhost:4200/


-Calling api without UI, using curl:

-To add a new aircraft:

curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"type": "VIP", "size": "Small"}' http://localhost:5000/aircraft

curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"type": "Emergency", "size": "Large"}' http://localhost:5000/aircraft

-Dequeue aircraft:
curl  -X DELETE http://localhost:5000/aircraft

-List aircrafts:

curl  -X GET  http://localhost:5000/aircraft

