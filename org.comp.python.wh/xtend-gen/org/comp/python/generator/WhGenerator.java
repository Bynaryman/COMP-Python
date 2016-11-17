package org.comp.python.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.comp.python.wh.Entity;
import org.comp.python.wh.Feature;
import org.comp.python.wh.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class WhGenerator extends AbstractGenerator implements IGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
  }
  
  /**
   * for (e : resource.allContents.toIterable.filter(Entity)) {
   * fsa.generateFile(
   * e.fullyQualifiedName.toString("/") + ".wh",
   * e.compile)
   * }
   */
  public CharSequence compile(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _eContainer = e.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      boolean _notEquals = (!Objects.equal(_fullyQualifiedName, null));
      if (_notEquals) {
        _builder.append("package ");
        EObject _eContainer_1 = e.eContainer();
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer_1);
        _builder.append(_fullyQualifiedName_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    {
      Entity _superType = e.getSuperType();
      boolean _notEquals_1 = (!Objects.equal(_superType, null));
      if (_notEquals_1) {
        _builder.append("extends ");
        Entity _superType_1 = e.getSuperType();
        QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(_superType_1);
        _builder.append(_fullyQualifiedName_2, "");
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Feature> _features = e.getFeatures();
      for(final Feature f : _features) {
        _builder.append("    ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Feature f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    Type _type = f.getType();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_type);
    _builder.append(_fullyQualifiedName, "");
    _builder.append(" ");
    String _name = f.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public ");
    Type _type_1 = f.getType();
    QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_1);
    _builder.append(_fullyQualifiedName_1, "");
    _builder.append(" get");
    String _name_1 = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return ");
    String _name_2 = f.getName();
    _builder.append(_name_2, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public void set");
    String _name_3 = f.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
    _builder.append(_firstUpper_1, "");
    _builder.append("(");
    Type _type_2 = f.getType();
    QualifiedName _fullyQualifiedName_2 = this._iQualifiedNameProvider.getFullyQualifiedName(_type_2);
    _builder.append(_fullyQualifiedName_2, "");
    _builder.append(" ");
    String _name_4 = f.getName();
    _builder.append(_name_4, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("this.");
    String _name_5 = f.getName();
    _builder.append(_name_5, "    ");
    _builder.append(" = ");
    String _name_6 = f.getName();
    _builder.append(_name_6, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Entity> _filter = Iterables.<Entity>filter(_iterable, Entity.class);
    for (final Entity e : _filter) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString("/");
      String _plus = (_string + ".wh");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus, _compile);
    }
  }
}
