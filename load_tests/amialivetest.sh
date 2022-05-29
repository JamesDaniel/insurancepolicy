docker run --net="host" --rm -v $(pwd):/src -i grafana/k6 run /src/amialivetest.js
