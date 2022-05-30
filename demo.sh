#!/bin/bash
methods=( GET POST PUT DELETE TRACE OPTIONS PATCH )
for i in "${methods[@]}"
do
    curl -I -X $i 'http://localhost:8080' -H 'Access-Control-Request-Method: GET' -H 'Origin: https://google.com'
done



#curl 'http://localhost:8080' -X OPTIONS -H 'Accept: */*' -H 'Accept-Language: en-US,en;q=0.5' -H 'Access-Control-Request-Method: GET'
#curl 'http://localhost:8080' -X OPTIONS -H 'Accept-Language: en-US,en;q=0.5' -H 'Access-Control-Request-Method: GET'
