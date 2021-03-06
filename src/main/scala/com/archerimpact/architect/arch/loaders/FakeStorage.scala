package com.archerimpact.architect.arch.loaders

import com.archerimpact.architect.arch.parsers.FakeParser
import com.archerimpact.architect.arch.shipments.{UrlShipment, FileShipment}

object FakeStorage extends Loader {
  override def urlToFile(fileURL: UrlShipment): FileShipment = new FileShipment(
    url="fakeURL",
    format ="fakeFormat",
    data="fakeData".getBytes,
    country="fakeCountry",
    author="fakeSource",
    parser=new FakeParser
  )
}
