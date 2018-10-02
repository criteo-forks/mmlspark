// Copyright (C) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See LICENSE in project root for information.

package com.microsoft.ml.spark

object LightGBMConstants {
  /** The default timeout for LightGBM network initialization
    */
  val defaultListenTimeout = 120
  /** Default buffer length for model
    */
  val defaultBufferLength: Int = 10000
}
