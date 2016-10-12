# SlideButton

A simple, elegant and customizable library for implementing the swipe button. Just add this library in your build.gradle and use the SlideButton view to use the slide view.

## Screenshots
See the melange of colors and the text change when swiping and when swipe is successful!!

![The button when you first view it](https://i.imgur.com/RVmfsQd.png "Simple button")
![The button with clamp configuration using two colors](https://i.imgur.com/oNSd8OJ.png "Simple button")
![The button with mirror configuration and two colors](https://i.imgur.com/gIyX0Z8.png "Simple button")
![The button with clamp configuration and three colors](https://i.imgur.com/Rnuw720.png "Simple button")
![The button with repeat configuration and two colors](https://i.imgur.com/kZj9Fa8.png "Simple button")
![The button with mirror configuration and three colors](https://i.imgur.com/tgdoC3a.png "Simple button")

#What all can you customize?

* **app:gradient_color_1** = Set the primary color of the Slide button.
* **app:gradient_color_2** = Set the secondary color of the Slide button.
* **app:gradient_color_3** = Set the tertiary color of the Slide button.
* **app:gradient_color_2_width** = Set the width of the secondary color.
* **app:after_confirmation_background** = The background to be shown after the button has been swiped.
* **app:button_swipe_text** = Set the text to be shown while swiping.
* **app:threshold** = The threshold to be crossed before a successful swipe is registered. This is between 0 and 1. Higher the value, the more length of the button need to be swiped.
* **app:button_confirm_text** = Set the text to be just after the swipable threshold has been crossed.
* **app:button_post_confirm_text** = Set the text to be shown after the user has removed their finger on a successful slide.
* **app:swipe_mode** = 3 options to choose from. clamp, mirror, repeat. The default value set is clamp. Experiment with the colors and this mode for amazing effects.

Use android:text = "bla bla" to set the initial text.
