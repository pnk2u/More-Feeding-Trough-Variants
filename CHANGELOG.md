<!--publish=false-->
## 1.2.0:
- `1.21.9(10)`: Update to <ins>1.21.10</ins>
- `1.21.4(5)`, `1.21.6(-8)`: Combine versions into `1.2.4(-8)`
- #### ⚠ **Breaking change**:
> **Empty all _Feeding Trough_ variants before updating.**  
> Items left inside any _Feeding Trough_ variant on versions < 1.2.0 will be lost after upgrade.

**Required actions:**
- Empty every _Feeding Trough_ variant's inventory.
- (Potentially necessary*) Break and re-place existing _Feeding Trough_ variant blocks.

> **Technical summary:**  
The variants' blocks now use the original _Animal Feeding Trough_'s block entity instead of a separate custom block entity.
This unification improves cross-version compatibility (e.g. the newly combined version `1.21.4(-8)`), stability, and maintainability.

<sup>*: In testing, this was not necessary, but if you encounter issues with existing _Feeding Trough_ blocks after updating, breaking and re-placing them should resolve the issue.</sup>