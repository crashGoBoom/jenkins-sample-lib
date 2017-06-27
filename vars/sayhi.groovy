class Result {
   boolean success
   String reason
}

Result call(pipeline_name) {
   echo "Oh hi...this came from pipeline: ${pipeline_name}."
   return new Result(success: true, reason: "Because it worked.")
}
