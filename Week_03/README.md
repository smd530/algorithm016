# 学习笔记

## 递归

**树的解法一般都是递归**

1. 节点的定义
2. 重复性（自相似性）

***

递归-循环

通过函数体进行的循环

***

**递归函数模版 Java**

```java
public void recur(int level, int param) {
    // 先写函数终止情况
    if (level > MAX_LEVEL) {
        return;
    }
    // 处理当前层逻辑
    process(level, param);
    // 到下一层
    recur( level: level + 1, newParam);
    // 清理当前层状态

}
```

***

**递归思维的要点**

1. 不要人肉递归
2. 找到最近最简方法 将其拆解成可重复解决的问题（重复子问题）
3. 数学归纳法思维

## 分治

分开处理

**分治函数模版Java**

```java
private static int divide_conquer(Problem problem, ) {

    if (problem == NULL) {
        int res = process_last_result();
        return res;
    }
    subProblems = split_problem(problem)

    res0 = divide_conquer(subProblems[0])
    res1 = divide_conquer(subProblems[1])

    result = process_result(res0, res1);

    return result;
}
```

## 回溯

试一试

