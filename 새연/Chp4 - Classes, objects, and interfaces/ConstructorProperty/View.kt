package ConstructorProperty

import javax.naming.Context
import javax.swing.text.AttributeSet

open class View {
    constructor(ctx: Context) { /* ... */ }
    constructor(ctx: Context, attr: AttributeSet) { /* ... */ }
}

class LikeButton: View {
    constructor(ctx: Context)
        : super(ctx) {
          // ...
         }

    constructor(ctx: Context, attr: AttributeSet)
            : super(ctx, attr) {

            }
}

class SubscribeButton: View {
//    constructor(ctx: Context): this(ctx, MY_STYLE) {
//
//    }

    constructor(ctx: Context, attr: AttributeSet)
            : super(ctx, attr) {

    }
}


