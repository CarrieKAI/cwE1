# Guide to run EasySQL demostration

**In order to run a demostration of EasySQL, please follow the steps below.**

**In Eclipse IDE:**
1. Import the project to Eclipse

2. Go to ` uk.ac.kcl.inf.group19.easySql >src >EasySql.xtext`, right click the file, select  `Run As > Generate Xtext Artifacts`, wait until last line of console shows **Done**.

3. Right click the `uk.ac.kcl.inf.group19.easySql` project, select `Run As >Run Configurations`. Search for `Lunch RunTime Eclipse`, click `Main` tab, set location for workspace data. Click `Run`.

**In Runtime Eclipse:**

4. Import `uk.ac.kcl.inf.group19.easySql.xpect` and `uk.ac.kcl.inf.group19.easySql.runtime` in runtime Eclipse

5. Open `src>test.esql.xt` in `uk.ac.kcl.inf.group19.easySql.xpect`, right click the file, select `Run As>Junit Test` to test the code.

6. Open `src>easySql_editor.esql` in `uk.ac.kcl.inf.group19.easySql.runtime`, there are sample code written in  EasySQL. The generated code are saved at `src-gen> EasySql_editor.sql.txt`

8. In order to create a new esql file, right click `src`folder, select `New>file`, create a new file with file extension `.esql`. 

10. Write EasySQL code in the created file, save the file after finishing, the generated text file will be automatically created at `src-gen` folder.


To test the generated code, copy the code from txt file, paste it in MySQL(assuming the related tables have been created).


**Syntax：**
* **Table declaration:**    
```
Table table_name
```

* **Insert command:**      
```
table_name.Insert(value1, value2,...)
```

* **Delete command:** 
```
table_name.Delete(Condition1)
```

* **Update command:** 
```
table_name.Update(column1 = value1, column2 = value2, ...).Condition(Condition)
```

* **Simple select command:**
```
table_name.Search(column(s)).Condition(Condition)[.RemoveDuplication()] [.ascending(column)] [.descending(column)]
```

* **Nested query command:**
```
var single_select_name = Simple select commands

table_name.Subsearch(column(s)).When(column).In(single_select_name)
```

* **Join command:** 
```
Joinsearch(column(s)).inner_join/left_join/right_join/full_join. table_name2. on(table_name1.column=table_name2.column)
```
