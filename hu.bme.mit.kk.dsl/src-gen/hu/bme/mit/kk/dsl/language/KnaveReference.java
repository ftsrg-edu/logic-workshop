/**
 */
package hu.bme.mit.kk.dsl.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knave Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kk.dsl.language.KnaveReference#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getKnaveReference()
 * @model
 * @generated
 */
public interface KnaveReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person</em>' reference.
   * @see #setPerson(Person)
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getKnaveReference_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link hu.bme.mit.kk.dsl.language.KnaveReference#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // KnaveReference
