<!--publish=false-->
## 1.2.0:
- `1.21.4(-10)`: Update to <ins>1.21.10</ins>
- `1.21.4(5)`, `1.21.6(-8)`: Combine versions into `1.2.4(-10)`  
- **Breaking change**: Internal update to use Feeding Trough block entity for improved cross-version compatibility (see warning below)  
<br>
**⚠ <ins>Warning</ins>**:  
  > **Remove** any **items** from *Freeding Throughs* **before updating**!  
  > Due to internal changes, any items placed inside of a Feeding Through slot will be **lost** when updating from versions prior to `1.2.0`.  
  > It might also be necessary to break and replace placed Feeding Trough blocks to ensure proper functionality, though I have not encountered any issues myself in testing.  
  >  
  > **Note**:  
  > > Regarding the internal changes:  
  > > The variants used to have their own custom block entity separate from the original Animal Feeding Trough block entity.  
  > > This has now been changed to use the original block entity, which greatly improves inter-version compatibility as can be seen with the combined versions above but also improves the general compatibility, stability and maintainability of the mod.