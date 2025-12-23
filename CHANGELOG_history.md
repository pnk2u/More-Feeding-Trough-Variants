<a name="1.2.1"></a>
### 1.2.1:
- `1.21.9(-11)`: Update to <ins>1.21.11</ins>
- `1.21(.1)`: Fix registration of block entities happening too early on Neoforge¹
- Reduce required Fabric Loader version by one minor version (from `>=0.18.0` to `>=0.17.0`)

¹<sup>: Not explicitly supported yet, via <ins>Sinytra Connector</ins> (&#x200A;<sub><a title="Sinytra Connector&#10;on Modrinth" href="https://modrinth.com/mod/connector/"><img width=20 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a></sub><!--SEPARATOR_V--><img width=5 height=8 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"><sub><a title="Sinytra Connector&#10;on Curseforge" href="https://www.curseforge.com/minecraft/mc-mods/sinytra-connector/"><img width=20 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a></sub>&#x200A;)</sup>

<h2><sub><sub><sup><ins>Download 1.2.1 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Feeding Trough Variants 1.2.1 + 1.21(.1)" href="https://www.modrinth.com/mod/1tqQKQKR/version/uHZDgZ2J">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;1.2.1 + 1.21(.1) - More Feeding Trough Variants" href="https://www.curseforge.com/minecraft/mc-mods/more-feeding-trough-variants/files/7371106">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.2.0"></a>
## 1.2.0:
- `1.21.9(10)`: Update to <ins>1.21.10</ins>
- `1.21.4(5)`, `1.21.6(-8)`: Combine versions into `1.2.4(-8)`
- `1.21(.1)`, `1.2.4(-8)`:
  #### ⚠ **Breaking change**:
> **Empty all _Feeding Trough_ variants before updating.**  
> Items left inside any _Feeding Trough_ variant on versions < `1.2.0` will be lost after upgrade.

**Required actions:**
- Empty every _Feeding Trough_ variant's inventory.
- (Potentially necessary\*) Break and re-place existing _Feeding Trough_ variant blocks.

> **Technical summary:**  
The variants' blocks now use the original _Animal Feeding Trough_'s block entity instead of a separate custom block entity.
This unification improves cross-version compatibility (e.g. the newly combined version `1.21.4(-8)`), stability, and maintainability.  
> `1.20.1` versions are unaffected as the Fabric feature\*² allowing this change was only added in `1.21`.

<sup>*: In testing, this was not necessary, but if you encounter issues with existing _Feeding Trough_ blocks after updating, breaking and re-placing them should resolve the issue.</sup>  
<sup>*²: `FabricBlockEntityType.addSupportedBlock()`</sup> 

<h2><sub><sub><sup><ins>Download 1.2.0 + 1.21(.1)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Feeding Trough Variants 1.2.0 + 1.21(.1)" href="https://www.modrinth.com/mod/1tqQKQKR/version/l1Is1AAu">
<img width=26 src="https://img.shields.io/badge/-%20-%23032a?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;More Feeding Trough Variants 1.2.0 + 1.21(.1)" href="https://www.curseforge.com/minecraft/mc-mods/more-feeding-trough-variants/files/7237442">
<img width=26 src="https://img.shields.io/badge/--%23302a?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.1.1"></a>
### 1.1.1:
- `1.21.6`: Update to 1.21.6

<h2><sub><sub><sup><ins>Download 1.1.1 + 1.21.6(-8)</ins>:</sup>&#x200A;
<a title="Download (Modrinth):&#10;More Feeding Trough Variants 1.1.1 + 1.21.6(-8)" href="https://modrinth.com/mod/more-feeding-trough-variants/version/Np9JS7Ss">
<img width=26 src="https://img.shields.io/badge/-%20-%230f91?style=flat&logo=modrinth"></a>
<sup><img width=7 height=10 src="https://raw.githubusercontent.com/pnk2u/resources/main/ModProjects/shared/pres/icon/separator_v.svg"></sup>
<a title="Download (Curseforge):&#10;More Feeding Trough Variants 1.1.1 + 1.21.6(-8)" href="https://www.curseforge.com/minecraft/mc-mods/more-feeding-trough-variants/files/6689155">
<img width=26 src="https://img.shields.io/badge/--%23f062?style=flat&logo=curseforge"></a>
</sub></sub></h2>

<a name="1.1.0"></a>
## 1.1.0:
- Add _Pale Oak Feeding Trough_ (Requires [More Composter Variants 1.8.0+](https://modrinth.com/mod/more-composter-variants/version/1.8.0))

---
<a name="1.0.4"></a>
### 1.0.4:
- `1.21.4`: Update to 1.21.4
- Add Simplified Chinese Translation (by @[qiuqimc](https://github.com/qiuqimc))

---
<a name="1.0.3"></a>
### 1.0.3:
- `1.21.3`: Update to 1.21.3

---
<a name="1.0.2"></a>
### 1.0.2:
- `1.20.1`, `1.20.4`: Add missing compatibility for Java 17

---
<a name="1.0.1"></a>
### 1.0.1:
- Group feeding trough variant recipes to take up less space in the recipe book

---
