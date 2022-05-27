RESPONSE=$(curl --write-out '%{http_code}' --silent --output /dev/null localhost:9000)

if [ "$RESPONSE" = "200" ]; then
    bash mvnw sonar:sonar
else
    echo "---------------------------------------------"
    echo "------- Make sure sonar is running ----------"
    echo "-------    bash sonar-start.sh     ----------"
    echo "---------------------------------------------"
fi
