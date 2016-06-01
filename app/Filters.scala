import javax.inject._
import play.api.http.HttpFilters
import filters.{Filter3, Filter2, Filter1}

@Singleton
class Filters @Inject() (
  filter1: Filter1, filter2: Filter2, filter3: Filter3) extends HttpFilters {

  override val filters = {
    Seq(filter1, filter2, filter3)
  }

}
