# Getting Dressed

Coding exerscise

## Getting Started


Rules:
-   Temperature can be HOT or COLD
-	You start in the house with your PJ's on
-	Pajamas must be taken off before anything else can be put on
-	Only 1 piece of each type of clothing may be put on
-	You cannot put on socks when it is hot
-	You cannot put on a jacket when it is hot
-	Socks must be put on before footwear
-	Pants must be put on before footwear
-	The shirt must be put on before the headwear or jacket
-	You cannot leave the house until all items of clothing are on 
(except socks and a jacket when it's hot)
-	If an invalid command is issued, respond with "fail" and stop processing commands

Running the application: Execute the jar command with each input string starting with the temperature



```
java -jar GetDressed-1.0-SNAPSHOT.jar COLD 8, 6, 3, 4, 2, 5, 1, 7
Removing PJs, pants, socks, shirt, hat, jacket, boots, leaving house

java -jar GetDressed-1.0-SNAPSHOT.jar HOT 8, 6, 4, 2, 1, 7
Removing PJs, shorts, shirt, sunglasses, sandals, leaving house

java -jar GetDressed-1.0-SNAPSHOT.jar HOT 8, 6, 6
Removing PJs, shorts, fail

```


### Tests

AppTest - Will run test some sample scenarios provided against main

DressControlTest - Will run more tests scenarios based off the rules provided 




## Built With

* [Maven](https://maven.apache.org/) - Dependency Management