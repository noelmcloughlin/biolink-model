---
parent: Class Mixins
title: biolink:Mixture
grand_parent: Classes
layout: default
---

# Class: Mixture


The physical combination of two or more molecular entities in which the identities are retained and are mixed in the form of solutions, suspensions and colloids.

URI: [biolink:Mixture](https://w3id.org/biolink/vocab/Mixture)


---

![img](http://yuml.me/diagram/nofunky;dir:TB/class/[ChemicalSubstance]%3Chas%20constituent%200..%2A-%20[Mixture],[Food]uses%20-.-%3E[Mixture],[Drug]uses%20-.-%3E[Mixture],[Food],[Drug],[ChemicalSubstance])

---


## Mixin for

 * [Drug](Drug.md) (mixin)  - A substance intended for use in the diagnosis, cure, mitigation, treatment, or prevention of disease
 * [Food](Food.md) (mixin)  - A substance consumed by a living organism as a source of nutrition

## Referenced by class


## Attributes


### Own

 * [has constituent](has_constituent.md)  <sub>0..*</sub>
    * Description: one or more chemical substances within a mixture
    * range: [ChemicalSubstance](ChemicalSubstance.md)