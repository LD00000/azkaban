#!/bin/bash

# pass along command line arguments to azkaban-executor-start.sh script
bin/azkaban-executor-start.sh "$@" >logs/executorServerLog__`date +%F`.out 2>&1 &

tail -f logs/executorServerLog__`date +%F`.out
