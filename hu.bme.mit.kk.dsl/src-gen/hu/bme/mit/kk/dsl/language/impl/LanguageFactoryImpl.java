/**
 */
package hu.bme.mit.kk.dsl.language.impl;

import hu.bme.mit.kk.dsl.language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LanguageFactory init()
  {
    try
    {
      LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory(LanguagePackage.eNS_URI);
      if (theLanguageFactory != null)
      {
        return theLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LanguagePackage.MODEL: return createModel();
      case LanguagePackage.PERSON: return createPerson();
      case LanguagePackage.STATEMENT: return createStatement();
      case LanguagePackage.EXPRESSION: return createExpression();
      case LanguagePackage.IFF: return createIff();
      case LanguagePackage.OR: return createOr();
      case LanguagePackage.AND: return createAnd();
      case LanguagePackage.NEGATIONABLE: return createNegationable();
      case LanguagePackage.KNIGHT_REFERENCE: return createKnightReference();
      case LanguagePackage.KNAVE_REFERENCE: return createKnaveReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iff createIff()
  {
    IffImpl iff = new IffImpl();
    return iff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negationable createNegationable()
  {
    NegationableImpl negationable = new NegationableImpl();
    return negationable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnightReference createKnightReference()
  {
    KnightReferenceImpl knightReference = new KnightReferenceImpl();
    return knightReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KnaveReference createKnaveReference()
  {
    KnaveReferenceImpl knaveReference = new KnaveReferenceImpl();
    return knaveReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguagePackage getLanguagePackage()
  {
    return (LanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LanguagePackage getPackage()
  {
    return LanguagePackage.eINSTANCE;
  }

} //LanguageFactoryImpl
