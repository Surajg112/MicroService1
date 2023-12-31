# MicroService1

MicroServices-
A MicroService is a service built around a specific business capability which can be 
independently deployed. So, to build large enterprise applications we can identify the 
sub-domains of our main business domain and build each sub-domain as a MicroService using 
Domain Driven Design (DDD) techniques. But in the end, we need to make all these 
microservices work together to serve the end user as if it is a single application.

Advantages of MicroServices-
Comprehending smaller codebase is easy
Can independently scale up highly used services
Each team can focus on one (or few) MicroService(s)
Technology updates/rewrites become simpler

Challenges with MicroServices-
Getting correct sub-domain boundaries, in the beginning, is hard
Need more skilled developers to handle distributed application complexities
Managing MicroServices based applications without proper DevOps culture is next to 
impossible
Local developer environment setup might become complex to test cross-service communications. 



<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>