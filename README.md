# acsystem


How to run it:
REST App:
- The application can be run in Docker using command: </br> 
./start.sh 


- To run the REST application without Docker: </br>
./mvnw package && java -jar  -Dserver.port=5000  target/acsystem-0.0.1-SNAPSHOT.jar

</br> 

UI:
- To run Angular app, access UI to Enqueue, Dequeue and List Aircrafts:
</br> 
cd ui  
</br>
npm install
</br>
ng server
</br> 
Browse to http://localhost:4200/

</br>
</br> 
-Calling api without UI, using curl:
</br> 
</br>
-To add a new aircraft:
</br>
</br>
curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"type": "VIP", "size": "Small"}' http://localhost:5000/aircraft
</br>
</br>
curl -H "Accept: application/json" -H "Content-type: application/json" -X POST -d '{"type": "Emergency", "size": "Large"}' http://localhost:5000/aircraft

</br>
</br>
-Dequeue aircraft:
</br>
curl  -X DELETE http://localhost:5000/aircraft

</br>
</br>
-List aircrafts:
</br>
curl  -X GET  http://localhost:5000/aircraft
