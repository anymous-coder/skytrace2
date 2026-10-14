# SkyTrace2 delta

Complete patch set for bubble + DNS ad block on top of fidzzcodex-me/skytrace.

## Reconstruct

```bash
cat delta/skytrace2-delta.tgz.b64.part* | base64 -d > skytrace2-delta.tgz
tar xzf skytrace2-delta.tgz
```

Then copy into a clone of upstream SkyTrace.

## Included paths

- android/app/src/main/kotlin/com/skytrace/adblock/AdBlock.kt
- android/app/src/main/kotlin/com/skytrace/bubble/BubbleController.kt
- android/app/src/main/kotlin/com/skytrace/bubble/BubbleGeometry.kt
- android/app/src/main/kotlin/com/skytrace/vpn/DnsCache.kt
- android/app/src/main/kotlin/com/skytrace/vpn/UdpRelay.kt
- android/app/src/main/kotlin/com/skytrace/vpn/VpnServiceManager.kt
- android/app/src/main/kotlin/com/skytrace/repo/SettingsStore.kt
- android/app/src/main/kotlin/com/skytrace/repo/Graph.kt
- android/app/src/main/kotlin/com/skytrace/VpnPlugin.kt
- android/app/src/main/AndroidManifest.xml
- android/app/src/test/kotlin/com/skytrace/AdBlockTest.kt
- android/app/src/test/kotlin/com/skytrace/BubbleGeometryTest.kt
