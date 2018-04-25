package com.archerimpact.architect.keystone.loaders

import com.archerimpact.architect.keystone.shipments.{FileURL, RawFile}

trait Loader {
  def fileURLToRawFile(url: FileURL): RawFile
}