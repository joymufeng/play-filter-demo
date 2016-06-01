package filters

import javax.inject._

import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class Filter3 @Inject() (implicit ec: ExecutionContext) extends EssentialFilter {
  def apply(nextFilter: EssentialAction) = new EssentialAction {
    def apply(requestHeader: RequestHeader) = {
      println("Filter3 receive request")
      nextFilter(requestHeader).map { result =>
        println("Filter3 receive response")
        result
      }
    }
  }
}