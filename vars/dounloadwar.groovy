def call(){
 
  
 
  sh """
    curl -u admin:admin -o doctor-online -X GET ""http://54.221.7.12:8081"/repository/doctor-online-release/in/javahome/doctor-online/1.0/doctor-online-1.0.war"
  """
}
//curl -u admin:admin -o online-doctor -X GET http://54.221.7.12:8081/repository/doctor-online-release/in/javahome/doctor-online/1.0/doctor-online-1.0.war
