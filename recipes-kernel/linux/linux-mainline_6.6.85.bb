YOCTO_KMETA_BRANCH = "yocto-6.6"
SRCREV_yocto-kmeta = "52ff0d75713ce61962b325a2090bd55e216f0cf3"

require linux-mainline.inc

DESCRIPTION = "Mainline Longterm Linux kernel"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "5ebaccf4ca3428cd26817bae62171f4efd270eed866a3e3d0a1d9e970b7b7529"

KERNEL_FEATURES:append:orange-pi-3lts = " bsp/orange-pi-3lts/orange-pi-3lts-6_5.scc bsp/uwe5622/uwe5622-6_6.scc bsp/orange-pi-3lts/fix-rtc.scc"
KERNEL_FEATURES:append:orange-pi-zero2 = " bsp/h61x/orangepi-zero2-6_6.scc bsp/uwe5622/uwe5622-6_6.scc"
