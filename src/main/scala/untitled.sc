import ru.tinkoff.piapi.core.InvestApi
import ru.tinkoff.piapi.contract.v1._
import collection.JavaConverters._


var token = "t.T58Htyy6fYVFjMfxgy-tn9pxUeDxejJ-WnP-7d3cP7Qw13_IOCSb9aDIbycQYJXgeyjZB3cHFwn_eOn6TwuJpA"
var api = InvestApi.create(token)

var order = api.getInstrumentsService.getAllShares
println(order)
println(api.getMarketDataService.getLastPrices(Iterable("APPL").asJava))