/**
 */
package hu.bme.mit.kk.dsl.language;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.kk.dsl.language.Statement#getPerson <em>Person</em>}</li>
 *   <li>{@link hu.bme.mit.kk.dsl.language.Statement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
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
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getStatement_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link hu.bme.mit.kk.dsl.language.Statement#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see hu.bme.mit.kk.dsl.language.LanguagePackage#getStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link hu.bme.mit.kk.dsl.language.Statement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Statement
