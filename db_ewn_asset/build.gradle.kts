/*
 * Copyright (c) 2026. Bernard Bou <1313ou@gmail.com>
 */

plugins {
    id("com.android.asset-pack")
}

assetPack {
    packName = "db_ewn_asset" // Directory name for the asset pack
    dynamicDelivery {
        deliveryType = "on-demand"
    }
}
