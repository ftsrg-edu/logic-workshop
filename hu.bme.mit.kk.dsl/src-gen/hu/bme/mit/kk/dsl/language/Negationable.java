/**
 */
package hu.bme.mit.kk.dsl.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negationable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kk.dsl.language.Negationable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getNegationable()
 * @model
 * @generated
 */
public interface Negationable extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getNegationable_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link hu.bme.mit.kk.dsl.language.Negationable#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // Negationable
