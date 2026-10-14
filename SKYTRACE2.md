# SkyTrace2 notes

## Structure rule

Download upstream zip → extract → **delete the outer folder** → keep files at root.

Same rule for this fork: contents are the app tree, not `skytrace2/skytrace-main/...`.

## Features

1. Bubble: overlay when capture RUNNING; support check; default OFF
2. Ad block: DNS NXDOMAIN for known ad/tracker domains when VPN on; default ON (`adBlockEnabled`)

## No line comments

New Kotlin modules avoid `//` comments.
