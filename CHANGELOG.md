# Change Log for javapos-contracts

## 1.15.2 Maintenance Release

- added general constants `JPOS_FALSE` and `JPOS_FALSE` to `JposConst`, as workaround for a type error in `PointCardRW.CapCardEntranceSensor`; solves GH issues #20
- added missing *PINPad* constant `PPAD_TIMEOUT`; solves GH issues #19 

## 1.15.1 Maintenance Release

- added ElectronicValueRW constants EVRW_TAG_NIT_ALL and EVRW_TAG_NIT_UPDATED; solves GH issue #17
- added ElectronicValueRW constants EVRW_TAG_TT_COMPLETION and EVRW_TAG_TT_PRE_SALES; solves GH issue #16

## 1.15.0

- added outstanding enhancements and corrections from UnifiedPOS 1.14.1 regarding Electronic Value Reader/Writer; solves GH issue #12
- added enhancements from UnifiedPOS 1.15; solves GH issue #15
- added serialization UIDs for all events at jpos.events and for jpos.JposException to get rid of all compiler warnings
- added JavaPOS naming convention aligned constants at `ElectronicValueRWConst` replacing the OPOS constants added by mistake, marked the OPOS constants as deprecated; solves GH issue #14
- added `getGateStatus` to _Gate_ which was missing since version 1.12 where it was misspelled as `getGetStatus`; solves GH issue #9

## 1.14.4

- **Major Change**: requires Java 8 runtime (cannot be marked as major version change accordingly as major and minor version is aligned to UnifiedPOS version)
- publishes to MavenCentral only, not Bintray (as Bintray has been shut down)
- `Gate.getCapRealTimeData()` has been marked as deprecated as it is not defined in UnifiedPOS at all; solved GH issue #10
- added `ScaleConst.SCAL_SUE_WEIGHT_UNDERWEIGHT` to be UnifiedPOS compliant; solved GH issue #7
- added constants `FPTR_AT_DISCOUNT` and `FPTR_AT_SURCHARGE` to `FiscalPrinterConst` to be UnifiedPOS compliant; solved GH issue #8

## 1.14.3 Maintenance Release

- Solves GH issues #2 and #3 by changing device control interfaces `jpos.ElectronicValueRWControl114` and `jpos.ScaleControl114`.

## 1.14.2 Maintenance Release

- Adds lacking *Transition* event callback method solving GH issue #4.

## 1.14.1 Maintenance Release

- Fixed issue #1: corrected value of constant `RFID_PR_ISO15693` to resolve bitwise ambiguity to constant values of `RFID_PR_ISO14443A` and `RFID_PR_ISO14443B`.

## 1.14.0 Release

This release corresponds to JavaPOS version 1.14 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.14.0-Source-20131024.zip
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

In this release

- new event concept of TransitionEvent has been added for ElectronicValueRW
- new constants, properties, and methods for ElectronicValueRW, Scale, and Scanner has been added

## 1.13.6 Maintenance Release

- Fixed issue #1: corrected value of constant `RFID_PR_ISO15693` to resolve bitwise ambiguity to constant values of `RFID_PR_ISO14443A` and `RFID_PR_ISO14443B`.

## 1.13.5 Maintenance Release

This release corresponds to JavaPOS version 1.13.5 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.13.5-Source-20131024.zip
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

In this release the following changes has been done

- backward correction to Belt 1.12: corrected return types of `getCapSpeedStepsBackward()` and getCapSpeedStepsForward(); was `boolean`, but should have been `int`
- Cat: added missing property OutputID
- ImageScanner: added implementation to control making it a non-empty implementation
- MICR: corrected value of "CountryCode" constant `MICR_CC_OTHER`
- MSR: added new retrieveDeviceAuthenticationData with correct parameter type; old method left in place for compatibility
- POSPrinter: re-added dropped, misspelled slip cartridge constant for backwards compatibility
- ToneIndicator: added missing "MelodyType" constants

## 1.13.0 Release

This release corresponds to JavaPOS version 1.13 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.13.0-Source-20090901.zip
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

In this release

- constants to Biometrics, MICR, POSPrinter, ToneIndicator has been added
- backward correction to ImageScanner to service has been done making it a non-empty
- implementation (ImageScanner control seemed to be forgotten to be  corrected...)
- added new properties or methods to POSPrinter, Scale, ToneIndicator

## 1.12.2 Release

This release corresponds to JavaPOS version 1.12 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.12.2-Source-20080914.zip
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

In this release

- categories Belt, Gate, ItemDispenser, Lights RFIDScanner has been added
- backward correction for typo in CashChanger 1.11
- constants added to Biometrics, ElectronicJournal, POSPrinter, scanner
- significant enhancement for MSR regarding authentication and encryption

## 1.11.0 Release

This release corresponds to JavaPOS version 1.11 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.11.0-Source-20071101.zip (link on javapos.com is wrong but this file may be downloaded)
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

In this release

- categories BillAcceptor, BillDispenser has been added
- major backward corrections for Biometrics 1.10 has been done
- new constants `E_DEPRECATED`, and to FiscalPrinter, Keylock, Scanner has been added
- backward correction for MSR regarding writeTracks parameter type has been done

## 1.10 Release

This release corresponds to JavaPOS version 1.10 containing device service interfaces, device control interfaces, data types, and exception types as originally provided by

- http://javapos.com/downloads/JavaPOS-1.10-Source-20060208.zip
- https://sourceforge.net/projects/jposloader/files/jcl/2.2.0/jcl2.2.0.zip

For details how the content is built as part from the original archives, see the Wiki.

In this release the device categories

- Biometrics
- ElectronicJournal

has been added.

Some constants has been added to MSR, POSPrinter, and Scale.


*For older release see https://github.com/JavaPOSWorkingGroup/javapos-contracts/releases*