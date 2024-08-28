package annotation

@Target(AnnotationTarget.PROPERTY)
annotation class MetaAnnotation

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class SeveralAnnotation

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding