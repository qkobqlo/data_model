package transformers;

public interface Transformerable <Arg, Bean>{

    void transform(Arg argType, Bean beanType);
}
