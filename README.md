# Zuul_Eureka_OpenFeign_CircuitBreaker_Hysteris

FromZuul Api gateway

  http://192.168.0.19:2020/B-api/callAFromB
  
  http://192.168.0.19:2020/A-api/callBFromA

serviceA

  http://192.168.0.19:8091/nameA
  
  http://192.168.0.19:8091/callBFromA

serviceB

  http://192.168.0.19:8092/nameB
  
  http://192.168.0.19:8092/callAFromB




From ServiceA

  http://192.168.0.19:8091/callB1FromA

  http://192.168.0.19:8091/callB2FromA

From ZuulApiGateway

  http://192.168.0.19:2020/B1-api/getB1

  http://192.168.0.19:2020/B2-api/getB2
