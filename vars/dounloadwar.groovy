def call(version,outputFile,repoName,groupId,artifactId, extension){
  def NEXUS_URUL = "http://54.221.7.12:8081"
  groupId = groupId.replace(".","/")
  echo groupId
  sh """
    curl -u admin:admin -o ${outputFile} -X GET "${NEXUS_URUL}/repository/${repoName}/${groupId}/${artifactId}/${version}/doctor-online-${version}.${extension}"
  """
}
