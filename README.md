# osnovi_java_1

Базовый проект на Java для демонстрации основных арифметических и логических операций, диапазонов типов данных с плавающей точкой, а также переполнения (overflow/underflow).

## Описание

Проект демонстрирует следующие темы:

### 0. Арифметические операции над `int`
Демонстрация базовых операций: сложение, вычитание, умножение, деление и остаток от деления (`%`) над двумя целыми числами типа `int`.

### 1. Арифметические операции над `int` и `double`
Показано, как Java автоматически приводит тип `int` к `double` (widening conversion) при вычислениях в одном выражении.

### 2. Логические (сравнительные) операции
Примеры использования операторов сравнения: `<`, `>`, `>=`, `<=`, `==`, `!=`, а также логических операторов `&&`, `||`, `!`.

### 3. Диапазоны типов с плавающей точкой (`float` / `double`)
Вывод минимальных и максимальных значений для `float` и `double` через константы:
- `Float.MIN_VALUE`, `Float.MAX_VALUE`, `Float.MIN_NORMAL`
- `Double.MIN_VALUE`, `Double.MAX_VALUE`, `Double.MIN_NORMAL`
- `Float.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, `Double.NaN`

### 4. Переполнение (Overflow / Underflow)
- **int/long**: переполнение "заворачивается" (wrap-around) без выброса исключения
- **double/float**: переполнение даёт `Infinity`
- **Underflow**: результат слишком мал → `0.0`
- Проверка через `Double.isInfinite()` и `Double.isNaN()`

## Требования

- Java JDK 11 или выше
- Gradle 7+ (или Gradle Wrapper)

## Сборка и запуск

```bash
# Сборка проекта
gradle build

# Запуск приложения
gradle run
```

## Структура проекта

```
osnovi_java_1/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/
│   │           └── Main.java      # Основной класс с примерами
│   └── test/
├── build.gradle
└── README.md
```

## Вывод программы

```
=== 0) Операции над int ===
a + b = 65
a - b = -21
a * b = 946
a / b = 0
a % b = 22

=== 1) Операции над int и double ===
x + y = 21.5
x - y = 8.5
x * y = 97.5
x / y = 2.3076923076923075
x / y * 2 - y + 1 = -0.884615384615385

=== 2) Сравнительные операции ===
m <  n  = false
m >  n  = true
m >= n  = true
m <= n  = false
m == n  = false
m != n  = true
(m > n) && (m < 10) = true
(m < n) || (m == 9) = true
!(m == n)           = true

=== 3) Диапазоны float и double ===
float  MIN_VALUE            = 1.4E-45
float  MAX_VALUE            = 3.4028235E38
double MIN_VALUE            = 4.9E-324
double MAX_VALUE            = 1.7976931348623157E308
...

=== 4) Переполнение ===
Integer.MAX_VALUE          = 2147483647
Integer.MAX_VALUE + 1      = -2147483648
...
```

## License

MIT
