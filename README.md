# Интерфейсы

Это контракт поведения

Содержит:

* функции без реализации;
* функции с default-реализацией;
* свойства без хранения;

### Пример
### Определяем интерфейс видео-плеера:

```
    interface VideoPlayable {
        fun play()
    }
```

### Определяем интерфейс аудио-плеера:
```
    interface AudioPlayable {
        fun play()
    }
```

### Далее создадим класс, который будет реализовывать оба интерфейса, и в нём переопределим метод для обоих интерфейсов:
```
    class MediaPlayer :VideoPlayable, AudioPlayble {
        override fun play () {
            println("Play audio and video")
        }
    }
```
